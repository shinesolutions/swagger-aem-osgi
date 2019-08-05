function New-ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${processPeriodlabel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${Notify on Complete}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties -ArgumentList @(
            ${processPeriodlabel},
            ${Notify on Complete}
        )
    }
}
