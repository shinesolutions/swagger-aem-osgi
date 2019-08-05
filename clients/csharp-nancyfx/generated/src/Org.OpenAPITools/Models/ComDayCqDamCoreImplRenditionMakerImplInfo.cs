using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplRenditionMakerImplInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplRenditionMakerImplInfo:  IEquatable<ComDayCqDamCoreImplRenditionMakerImplInfo>
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
        public ComDayCqDamCoreImplRenditionMakerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplRenditionMakerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplRenditionMakerImplInfo()
        {
        }

        private ComDayCqDamCoreImplRenditionMakerImplInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplRenditionMakerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplRenditionMakerImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplRenditionMakerImplInfoBuilder</returns>
        public static ComDayCqDamCoreImplRenditionMakerImplInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplRenditionMakerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplRenditionMakerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplRenditionMakerImplInfoBuilder</returns>
        public ComDayCqDamCoreImplRenditionMakerImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplRenditionMakerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplRenditionMakerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplRenditionMakerImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplRenditionMakerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplRenditionMakerImplInfo left, ComDayCqDamCoreImplRenditionMakerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplRenditionMakerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplRenditionMakerImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplRenditionMakerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplRenditionMakerImplInfo left, ComDayCqDamCoreImplRenditionMakerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplRenditionMakerImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplRenditionMakerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplRenditionMakerImplProperties _Properties;

            internal ComDayCqDamCoreImplRenditionMakerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplRenditionMakerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplRenditionMakerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplRenditionMakerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplRenditionMakerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplRenditionMakerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplRenditionMakerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplRenditionMakerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplRenditionMakerImplInfoBuilder Properties(ComDayCqDamCoreImplRenditionMakerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplRenditionMakerImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplRenditionMakerImplInfo</returns>
            public ComDayCqDamCoreImplRenditionMakerImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplRenditionMakerImplInfo(
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