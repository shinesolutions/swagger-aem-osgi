function New-ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${adapterPeriodcondition}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties -ArgumentList @(
            ${adapterPeriodcondition}
        )
    }
}
