function New-ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${purgeCompleted},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${completedAge},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${purgeActive},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${activeAge},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${saveThreshold}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties -ArgumentList @(
            ${purgeCompleted},
            ${completedAge},
            ${purgeActive},
            ${activeAge},
            ${saveThreshold}
        )
    }
}
