function New-ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${granitePeriodworkflowinboxPeriodsortPeriodpropertyName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${granitePeriodworkflowinboxPeriodsortPeriodorder},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodworkflowPeriodjobPeriodretry},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodworkflowPeriodsuperuser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${granitePeriodworkflowPeriodinboxQuerySize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodworkflowPeriodadminUserGroupFilter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodworkflowPeriodenforceWorkitemAssigneePermissions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodworkflowPeriodenforceWorkflowInitiatorPermissions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodworkflowPeriodinjectTenantIdInJobTopics},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${granitePeriodworkflowPeriodmaxPurgeSaveThreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${granitePeriodworkflowPeriodmaxPurgeQueryCount}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties -ArgumentList @(
            ${granitePeriodworkflowinboxPeriodsortPeriodpropertyName},
            ${granitePeriodworkflowinboxPeriodsortPeriodorder},
            ${cqPeriodworkflowPeriodjobPeriodretry},
            ${cqPeriodworkflowPeriodsuperuser},
            ${granitePeriodworkflowPeriodinboxQuerySize},
            ${granitePeriodworkflowPeriodadminUserGroupFilter},
            ${granitePeriodworkflowPeriodenforceWorkitemAssigneePermissions},
            ${granitePeriodworkflowPeriodenforceWorkflowInitiatorPermissions},
            ${granitePeriodworkflowPeriodinjectTenantIdInJobTopics},
            ${granitePeriodworkflowPeriodmaxPurgeSaveThreshold},
            ${granitePeriodworkflowPeriodmaxPurgeQueryCount}
        )
    }
}
