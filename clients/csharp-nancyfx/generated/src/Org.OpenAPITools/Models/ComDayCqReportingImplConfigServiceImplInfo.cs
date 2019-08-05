using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReportingImplConfigServiceImplInfo
    /// </summary>
    public sealed class ComDayCqReportingImplConfigServiceImplInfo:  IEquatable<ComDayCqReportingImplConfigServiceImplInfo>
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
        public ComDayCqReportingImplConfigServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReportingImplConfigServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReportingImplConfigServiceImplInfo()
        {
        }

        private ComDayCqReportingImplConfigServiceImplInfo(string Pid, string Title, string Description, ComDayCqReportingImplConfigServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReportingImplConfigServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqReportingImplConfigServiceImplInfoBuilder</returns>
        public static ComDayCqReportingImplConfigServiceImplInfoBuilder Builder()
        {
            return new ComDayCqReportingImplConfigServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReportingImplConfigServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReportingImplConfigServiceImplInfoBuilder</returns>
        public ComDayCqReportingImplConfigServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqReportingImplConfigServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReportingImplConfigServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplConfigServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqReportingImplConfigServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReportingImplConfigServiceImplInfo left, ComDayCqReportingImplConfigServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReportingImplConfigServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplConfigServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqReportingImplConfigServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReportingImplConfigServiceImplInfo left, ComDayCqReportingImplConfigServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReportingImplConfigServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqReportingImplConfigServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReportingImplConfigServiceImplProperties _Properties;

            internal ComDayCqReportingImplConfigServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReportingImplConfigServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReportingImplConfigServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReportingImplConfigServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReportingImplConfigServiceImplInfoBuilder Properties(ComDayCqReportingImplConfigServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReportingImplConfigServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqReportingImplConfigServiceImplInfo</returns>
            public ComDayCqReportingImplConfigServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqReportingImplConfigServiceImplInfo(
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