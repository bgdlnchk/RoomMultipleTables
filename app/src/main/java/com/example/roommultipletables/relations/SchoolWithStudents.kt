package com.example.roommultipletables.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roommultipletables.entities.School
import com.example.roommultipletables.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val student: List<Student>
)