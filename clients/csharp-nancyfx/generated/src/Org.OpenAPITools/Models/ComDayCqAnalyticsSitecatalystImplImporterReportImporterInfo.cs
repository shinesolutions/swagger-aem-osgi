using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo:  IEquatable<ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo>
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
        public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo()
        {
        }

        private ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo(string Pid, string Title, string Description, ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder</returns>
        public static ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder</returns>
        public ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder With()
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

        public bool Equals(ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo left, ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo left, ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties _Properties;

            internal ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfoBuilder Properties(ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo</returns>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo(
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