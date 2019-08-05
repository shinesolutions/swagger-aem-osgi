function New-ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${payloadPeriodmovePeriodwhitePeriodlist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${payloadPeriodmovePeriodhandlePeriodfromPeriodworkflowPeriodprocess}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties -ArgumentList @(
            ${payloadPeriodmovePeriodwhitePeriodlist},
            ${payloadPeriodmovePeriodhandlePeriodfromPeriodworkflowPeriodprocess}
        )
    }
}
