#tag Class
Protected Class OrgApacheSlingEventJobsQueueConfigurationProperties

	#tag Property, Flags = &h0
		queue_name As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_topics As OpenAPIClient.Models.ConfigNodePropertyArray
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_type As OpenAPIClient.Models.ConfigNodePropertyDropDown
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_priority As OpenAPIClient.Models.ConfigNodePropertyDropDown
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_retries As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_retrydelay As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_maxparallel As OpenAPIClient.Models.ConfigNodePropertyFloat
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_keepJobs As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_preferRunOnCreationInstance As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		queue_threadPoolSize As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		service_ranking As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_topics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyDropDown"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_priority"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyDropDown"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_retries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_retrydelay"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_maxparallel"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyFloat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_keepJobs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_preferRunOnCreationInstance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="queue_threadPoolSize"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="service_ranking"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


