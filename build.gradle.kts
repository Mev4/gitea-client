plugins {
  id("java")
}

group = "dev.mev4"
version = "0.0.1-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  val oltu_version = "1.0.2"
  val retrofit_version = "2.11.0"
  val swagger_annotations_version = "2.0.0"
  val junit_version = "4.13.1"
  val threetenbp_version = "1.3.5"
  val json_fire_version = "1.8.0"

  implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
  implementation("com.squareup.retrofit2:converter-scalars:$retrofit_version")
  implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
  implementation("io.swagger.core.v3:swagger-annotations:$swagger_annotations_version")
  implementation("org.apache.oltu.oauth2:org.apache.oltu.oauth2.client:$oltu_version") {
    exclude(group = "org.json", module = "json")
  }
  implementation("org.json:json:20240303")
  implementation("io.gsonfire:gson-fire:$json_fire_version")
  implementation("org.threeten:threetenbp:$threetenbp_version")

  testImplementation("junit:junit:$junit_version")
}
