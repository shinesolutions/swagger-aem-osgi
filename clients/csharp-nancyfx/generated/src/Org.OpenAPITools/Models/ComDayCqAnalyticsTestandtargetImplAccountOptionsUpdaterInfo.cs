using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo:  IEquatable<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo>
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
        public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo(string Pid, string Title, string Description, ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder With()
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

        public bool Equals(ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo left, ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo left, ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties _Properties;

            internal ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoBuilder Properties(ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo</returns>
            public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo(
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