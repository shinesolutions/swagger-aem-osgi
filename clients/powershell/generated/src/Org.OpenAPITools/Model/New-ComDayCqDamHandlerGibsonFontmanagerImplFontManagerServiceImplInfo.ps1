function New-ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties}
        )
    }
}
