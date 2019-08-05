function New-ComAdobeGraniteRestImplServletDefaultGETServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${defaultPeriodlimit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${usePeriodabsolutePerioduri}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteRestImplServletDefaultGETServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteRestImplServletDefaultGETServletProperties -ArgumentList @(
            ${defaultPeriodlimit},
            ${usePeriodabsolutePerioduri}
        )
    }
}
