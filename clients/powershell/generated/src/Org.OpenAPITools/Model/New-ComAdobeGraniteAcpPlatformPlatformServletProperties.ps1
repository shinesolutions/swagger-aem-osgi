function New-ComAdobeGraniteAcpPlatformPlatformServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queryPeriodlimit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${filePeriodtypePeriodextensionPeriodmap}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAcpPlatformPlatformServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAcpPlatformPlatformServletProperties -ArgumentList @(
            ${queryPeriodlimit},
            ${filePeriodtypePeriodextensionPeriodmap}
        )
    }
}
