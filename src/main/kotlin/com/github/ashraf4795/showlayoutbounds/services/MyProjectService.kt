package com.github.ashraf4795.showlayoutbounds.services

import com.intellij.openapi.project.Project
import com.github.ashraf4795.showlayoutbounds.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
