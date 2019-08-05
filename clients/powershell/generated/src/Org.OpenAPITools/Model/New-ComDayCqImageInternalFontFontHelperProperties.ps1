function New-ComDayCqImageInternalFontFontHelperProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fontpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${oversamplingFactor}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqImageInternalFontFontHelperProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqImageInternalFontFontHelperProperties -ArgumentList @(
            ${fontpath},
            ${oversamplingFactor}
        )
    }
}
