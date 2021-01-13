package com.example.roommultipletables.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roommultipletables.entities.Director
import com.example.roommultipletables.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)