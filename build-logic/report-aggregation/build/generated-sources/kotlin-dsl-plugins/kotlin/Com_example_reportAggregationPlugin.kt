/**
 * Precompiled [com.example.report-aggregation.gradle.kts][Com_example_report_aggregation_gradle] script plugin.
 *
 * @see Com_example_report_aggregation_gradle
 */
class Com_example_reportAggregationPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Com_example_report_aggregation_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
