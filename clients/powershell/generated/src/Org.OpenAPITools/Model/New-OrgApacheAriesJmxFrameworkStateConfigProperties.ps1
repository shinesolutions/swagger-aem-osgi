function New-OrgApacheAriesJmxFrameworkStateConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${attributeChangeNotificationEnabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheAriesJmxFrameworkStateConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheAriesJmxFrameworkStateConfigProperties -ArgumentList @(
            ${attributeChangeNotificationEnabled}
        )
    }
}
