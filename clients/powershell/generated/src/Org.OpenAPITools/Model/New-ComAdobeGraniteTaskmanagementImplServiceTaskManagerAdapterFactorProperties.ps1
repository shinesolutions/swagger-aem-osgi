function New-ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${adapterPeriodcondition},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${taskmanagerPeriodadmingroups}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties -ArgumentList @(
            ${adapterPeriodcondition},
            ${taskmanagerPeriodadmingroups}
        )
    }
}
