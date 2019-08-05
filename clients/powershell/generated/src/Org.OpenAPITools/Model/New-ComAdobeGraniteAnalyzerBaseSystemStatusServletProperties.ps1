function New-ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${disabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties -ArgumentList @(
            ${disabled}
        )
    }
}
