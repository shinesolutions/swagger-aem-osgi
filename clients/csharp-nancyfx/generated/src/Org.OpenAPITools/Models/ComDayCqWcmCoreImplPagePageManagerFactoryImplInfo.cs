using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo:  IEquatable<ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo>
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
        public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo()
        {
        }

        private ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder</returns>
        public static ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder</returns>
        public ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo left, ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo left, ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties _Properties;

            internal ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplInfoBuilder Properties(ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo</returns>
            public ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo(
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