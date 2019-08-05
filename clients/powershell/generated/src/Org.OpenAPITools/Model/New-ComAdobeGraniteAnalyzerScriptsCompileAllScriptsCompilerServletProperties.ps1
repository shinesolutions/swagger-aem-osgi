function New-ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${disabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties -ArgumentList @(
            ${disabled}
        )
    }
}
