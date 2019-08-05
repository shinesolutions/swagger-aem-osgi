function New-OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queryLimitInMemory},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queryLimitReads},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${queryFailTraversal},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${fastQuerySize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties -ArgumentList @(
            ${queryLimitInMemory},
            ${queryLimitReads},
            ${queryFailTraversal},
            ${fastQuerySize}
        )
    }
}
