function New-ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${archivingPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${archivePeriodsincePerioddaysPeriodcompleted}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties -ArgumentList @(
            ${archivingPeriodenabled},
            ${schedulerPeriodexpression},
            ${archivePeriodsincePerioddaysPeriodcompleted}
        )
    }
}
