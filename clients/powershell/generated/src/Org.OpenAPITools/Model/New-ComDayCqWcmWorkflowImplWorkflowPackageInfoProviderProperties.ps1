function New-ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${workflowpackageinfoproviderPeriodfilter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${workflowpackageinfoproviderPeriodfilterPeriodrootpath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties -ArgumentList @(
            ${workflowpackageinfoproviderPeriodfilter},
            ${workflowpackageinfoproviderPeriodfilterPeriodrootpath}
        )
    }
}
