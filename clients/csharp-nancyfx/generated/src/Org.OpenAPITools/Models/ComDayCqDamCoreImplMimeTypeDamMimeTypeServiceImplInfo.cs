using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo:  IEquatable<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo>
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
        public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo()
        {
        }

        private ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder</returns>
        public static ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder</returns>
        public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo left, ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo left, ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties _Properties;

            internal ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoBuilder Properties(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo</returns>
            public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo(
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