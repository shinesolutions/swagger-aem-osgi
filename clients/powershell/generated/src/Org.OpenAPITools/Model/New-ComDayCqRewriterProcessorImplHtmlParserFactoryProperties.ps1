function New-ComDayCqRewriterProcessorImplHtmlParserFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmlparserPeriodprocessTags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmlparserPeriodpreserveCamelCase}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqRewriterProcessorImplHtmlParserFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqRewriterProcessorImplHtmlParserFactoryProperties -ArgumentList @(
            ${htmlparserPeriodprocessTags},
            ${htmlparserPeriodpreserveCamelCase}
        )
    }
}
