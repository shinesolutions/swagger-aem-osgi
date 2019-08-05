using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo:  IEquatable<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo()
        {
        }

        private ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo(string Pid, string Title, string Description, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder</returns>
        public static ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder</returns>
        public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo left, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo left, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties _Properties;

            internal ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoBuilder Properties(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo</returns>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}