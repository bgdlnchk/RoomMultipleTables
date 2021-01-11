package com.example.roommultipletables

import androidx.room.*
import com.example.roommultipletables.entities.Director
import com.example.roommultipletables.entities.School
import com.example.roommultipletables.entities.SchoolAndDirector

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirector(schoolName: String): List<SchoolAndDirector>
}