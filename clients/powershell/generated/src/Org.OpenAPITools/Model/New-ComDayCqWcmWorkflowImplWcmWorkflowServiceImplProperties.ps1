function New-ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodfilter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${minThreadPoolSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxThreadPoolSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodwcmPeriodworkflowPeriodterminatePeriodonPeriodactivate},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodworklfowPeriodterminatePeriodexclusionPeriodlist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties -ArgumentList @(
            ${eventPeriodfilter},
            ${minThreadPoolSize},
            ${maxThreadPoolSize},
            ${cqPeriodwcmPeriodworkflowPeriodterminatePeriodonPeriodactivate},
            ${cqPeriodwcmPeriodworklfowPeriodterminatePeriodexclusionPeriodlist}
        )
    }
}
