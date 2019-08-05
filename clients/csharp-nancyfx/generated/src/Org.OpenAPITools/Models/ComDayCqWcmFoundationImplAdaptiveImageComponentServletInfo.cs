using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo:  IEquatable<ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo>
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
        public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo()
        {
        }

        private ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder</returns>
        public static ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder</returns>
        public ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo left, ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo left, ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties _Properties;

            internal ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfoBuilder Properties(ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo</returns>
            public ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo(
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