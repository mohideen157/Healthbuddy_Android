package indg.com.cover2protect.model.ResponseModel

data class Data(
        val active: Int,
        val child_key: String,
        val created_at: String,
        val extra_info: Any,
        val id: Int,
        val parent_key: String,
        val patient_id: Int,
        val score: Any,
        val totalScore: String,
        val unit: Any,
        val updated_at: String,
        val value: String
)