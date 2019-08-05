using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventPagePostProcessorInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventPagePostProcessorInfo:  IEquatable<ComDayCqWcmCoreImplEventPagePostProcessorInfo>
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
        public ComDayCqWcmCoreImplEventPagePostProcessorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplEventPagePostProcessorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventPagePostProcessorInfo()
        {
        }

        private ComDayCqWcmCoreImplEventPagePostProcessorInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplEventPagePostProcessorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventPagePostProcessorInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder</returns>
        public static ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder</returns>
        public ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplEventPagePostProcessorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventPagePostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPagePostProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPagePostProcessorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventPagePostProcessorInfo left, ComDayCqWcmCoreImplEventPagePostProcessorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventPagePostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPagePostProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPagePostProcessorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventPagePostProcessorInfo left, ComDayCqWcmCoreImplEventPagePostProcessorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventPagePostProcessorInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplEventPagePostProcessorProperties _Properties;

            internal ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPagePostProcessorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPagePostProcessorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPagePostProcessorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPagePostProcessorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplEventPagePostProcessorInfoBuilder Properties(ComDayCqWcmCoreImplEventPagePostProcessorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventPagePostProcessorInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventPagePostProcessorInfo</returns>
            public ComDayCqWcmCoreImplEventPagePostProcessorInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventPagePostProcessorInfo(
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