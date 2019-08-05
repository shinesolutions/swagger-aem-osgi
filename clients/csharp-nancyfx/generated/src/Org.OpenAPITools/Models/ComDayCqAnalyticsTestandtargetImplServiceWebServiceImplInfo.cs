using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo:  IEquatable<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo>
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
        public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo(string Pid, string Title, string Description, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo left, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo left, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties _Properties;

            internal ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoBuilder Properties(ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo</returns>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo(
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