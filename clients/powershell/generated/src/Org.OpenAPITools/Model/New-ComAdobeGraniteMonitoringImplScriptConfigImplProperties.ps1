function New-ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scriptPeriodfilename},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scriptPerioddisplay},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scriptPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${scriptPeriodplatform},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${interval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jmxdomain}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteMonitoringImplScriptConfigImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteMonitoringImplScriptConfigImplProperties -ArgumentList @(
            ${scriptPeriodfilename},
            ${scriptPerioddisplay},
            ${scriptPeriodpath},
            ${scriptPeriodplatform},
            ${interval},
            ${jmxdomain}
        )
    }
}
