tasks.register<DuplicateFile>("duplicateInput") {
    fileCount.set(3)
    inputFile.set(project.file("input.txt"))
    generatedFileDir.set(layout.buildDirectory.dir("duplicates"))
}
