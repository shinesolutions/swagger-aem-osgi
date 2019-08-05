function New-ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodworkflowPeriodconfigPeriodworkflowPeriodpackagesPeriodrootPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodworkflowPeriodconfigPeriodworkflowPeriodprocessPeriodlegacyPeriodmode},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodworkflowPeriodconfigPeriodallowPeriodlocking}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreWorkflowConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreWorkflowConfigProperties -ArgumentList @(
            ${cqPeriodworkflowPeriodconfigPeriodworkflowPeriodpackagesPeriodrootPeriodpath},
            ${cqPeriodworkflowPeriodconfigPeriodworkflowPeriodprocessPeriodlegacyPeriodmode},
            ${cqPeriodworkflowPeriodconfigPeriodallowPeriodlocking}
        )
    }
}
