import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*
import java.io.File

@CacheableTask
abstract class DuplicateFile : DefaultTask() {

    @get:Input
    abstract val fileCount: Property<Int>

    @get:InputFile
    @get:PathSensitive(PathSensitivity.ABSOLUTE)
    abstract val inputFile: RegularFileProperty

    @get:OutputDirectory
    abstract val generatedFileDir: DirectoryProperty

    @TaskAction
    fun perform() {
        val text = File(inputFile.asFile.get().toURI()).readText()
        for (i in 1..fileCount.get()) {
            File(generatedFileDir.get().file("${i}.txt").asFile.toURI()).writeText("${text}-${i}")
        }
    }
}
