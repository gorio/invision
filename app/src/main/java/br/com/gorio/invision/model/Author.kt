package br.com.gorio.invision.model

import com.google.gson.annotations.SerializedName

data class Author(@SerializedName("profileUrl")
                  val profileUrl: String = "",
                  @SerializedName("birthday")
                  val birthday: String = "",
                  @SerializedName("coverPhotoUrl")
                  val coverPhotoUrl: String = "",
                  @SerializedName("joined")
                  val joined: String = "",
                  @SerializedName("formattedName")
                  val formattedName: String = "",
                  @SerializedName("timeZone")
                  val timeZone: String = "",
                  @SerializedName("secondaryGroups")
                  val secondaryGroups: List<SecondaryGroupsItem>?,
                  @SerializedName("lastVisit")
                  val lastVisit: String = "",
                  @SerializedName("profileViews")
                  val profileViews: Int = 0,
                  @SerializedName("title")
                  val title:String = "",
                  @SerializedName("reputationPoints")
                  val reputationPoints: Int = 0,
                  @SerializedName("posts")
                  val posts: Int = 0,
                  @SerializedName("photoUrl")
                  val photoUrl: String = "",
                  @SerializedName("photoUrlIsDefault")
                  val photoUrlIsDefault: Boolean = false,
                  @SerializedName("validating")
                  val validating: Boolean = false,
                  @SerializedName("lastPost")
                  val lastPost: String = "",
                  @SerializedName("name")
                  val name: String = "",
                  @SerializedName("lastActivity")
                  val lastActivity: String = "",
                  @SerializedName("id")
                  val id: Int = 0,
                  @SerializedName("warningPoints")
                  val warningPoints: Int = 0,
                  @SerializedName("primaryGroup")
                  val primaryGroup: PrimaryGroup,
                  @SerializedName("email")
                  val email: String = "",
                  @SerializedName("registrationIpAddress")
                  val registrationIpAddress: String = "")