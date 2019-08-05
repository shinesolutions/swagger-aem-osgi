function New-OrgApacheFelixHttpSslfilterSslFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${sslMinusforwardPeriodheader},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${sslMinusforwardPeriodvalue},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${sslMinusforwardMinuscertPeriodheader},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${rewritePeriodabsolutePeriodurls}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixHttpSslfilterSslFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixHttpSslfilterSslFilterProperties -ArgumentList @(
            ${sslMinusforwardPeriodheader},
            ${sslMinusforwardPeriodvalue},
            ${sslMinusforwardMinuscertPeriodheader},
            ${rewritePeriodabsolutePeriodurls}
        )
    }
}
