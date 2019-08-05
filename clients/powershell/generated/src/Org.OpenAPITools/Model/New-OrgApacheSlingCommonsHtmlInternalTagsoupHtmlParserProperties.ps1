function New-OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${parserPeriodfeatures}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties -ArgumentList @(
            ${parserPeriodfeatures}
        )
    }
}
