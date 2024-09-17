package com.max.foodies.data.room.roomDatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dbCategory_table")
data class DbCategory(
    @PrimaryKey(autoGenerate = false)
    val id: Int? = null,
    @ColumnInfo("name")
    val name: String? = null,
)