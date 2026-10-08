#tag Class
Protected Class ComDayCqDamCoreImplDamEventRecorderImplProperties

	#tag Property, Flags = &h0
		event_filter As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		event_queue_length As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		eventrecorder_enabled As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		eventrecorder_blacklist As OpenAPIClient.Models.ConfigNodePropertyArray
	#tag EndProperty


	#tag Property, Flags = &h0
		eventrecorder_eventtypes As OpenAPIClient.Models.ConfigNodePropertyDropDown
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
			Name="event_filter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="event_queue_length"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="eventrecorder_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="eventrecorder_blacklist"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="eventrecorder_eventtypes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyDropDown"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


