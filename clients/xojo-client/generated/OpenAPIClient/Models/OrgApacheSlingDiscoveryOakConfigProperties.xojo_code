#tag Class
Protected Class OrgApacheSlingDiscoveryOakConfigProperties

	#tag Property, Flags = &h0
		connectorPingTimeout As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		connectorPingInterval As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		discoveryLiteCheckInterval As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		clusterSyncServiceTimeout As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		clusterSyncServiceInterval As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		enableSyncToken As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		minEventDelay As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		socketConnectTimeout As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		soTimeout As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		topologyConnectorUrls As OpenAPIClient.Models.ConfigNodePropertyArray
	#tag EndProperty


	#tag Property, Flags = &h0
		topologyConnectorWhitelist As OpenAPIClient.Models.ConfigNodePropertyArray
	#tag EndProperty


	#tag Property, Flags = &h0
		autoStopLocalLoopEnabled As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		gzipConnectorRequestsEnabled As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		hmacEnabled As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		enableEncryption As OpenAPIClient.Models.ConfigNodePropertyBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		sharedKey As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		hmacSharedKeyTTL As OpenAPIClient.Models.ConfigNodePropertyInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		backoffStandbyFactor As OpenAPIClient.Models.ConfigNodePropertyString
	#tag EndProperty


	#tag Property, Flags = &h0
		backoffStableFactor As OpenAPIClient.Models.ConfigNodePropertyString
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
			Name="connectorPingTimeout"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="connectorPingInterval"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="discoveryLiteCheckInterval"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="clusterSyncServiceTimeout"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="clusterSyncServiceInterval"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="enableSyncToken"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="minEventDelay"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="socketConnectTimeout"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="soTimeout"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="topologyConnectorUrls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="topologyConnectorWhitelist"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="autoStopLocalLoopEnabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gzipConnectorRequestsEnabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hmacEnabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="enableEncryption"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sharedKey"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hmacSharedKeyTTL"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyInteger"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="backoffStandbyFactor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="backoffStableFactor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConfigNodePropertyString"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


