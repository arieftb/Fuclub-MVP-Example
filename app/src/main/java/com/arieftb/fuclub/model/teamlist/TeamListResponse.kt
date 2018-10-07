/*
 * Copyright www.arieftb.com (c) 2018.
 */

package com.arieftb.fuclub.model.teamlist

import com.google.gson.annotations.SerializedName


data class TeamListResponse(

	@field:SerializedName("teams")
	val teams: List<TeamsItem?>? = null
)