function New-ComDayCqDamInddImplServletSnippetCreationServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${snippetcreationPeriodmaxcollections}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamInddImplServletSnippetCreationServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamInddImplServletSnippetCreationServletProperties -ArgumentList @(
            ${snippetcreationPeriodmaxcollections}
        )
    }
}
