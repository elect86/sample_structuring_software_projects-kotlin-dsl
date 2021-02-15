plugins {
    id("com.example.kotlin-library")
}

println(group)
group = "${group}.admin-feature"
println(group)

dependencies {
    implementation("com.example.myproduct.state:application-state")
}
