using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo:  IEquatable<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo>
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
        public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo(string Pid, string Title, string Description, ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder With()
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

        public bool Equals(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo left, ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo left, ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties _Properties;

            internal ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder Properties(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo</returns>
            public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo(
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