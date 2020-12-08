package com.github.jbruell.intellijhoriizonprofiles.services

import com.intellij.openapi.project.Project
import com.github.jbruell.intellijhoriizonprofiles.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
