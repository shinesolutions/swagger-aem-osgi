using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo:  IEquatable<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo>
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
        public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo()
        {
        }

        private ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder</returns>
        public static ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder</returns>
        public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo left, ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo left, ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties _Properties;

            internal ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoBuilder Properties(ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo</returns>
            public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo(
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