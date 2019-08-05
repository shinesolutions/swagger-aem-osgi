using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplVersionManagerImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplVersionManagerImplInfo:  IEquatable<ComDayCqWcmCoreImplVersionManagerImplInfo>
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
        public ComDayCqWcmCoreImplVersionManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplVersionManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplVersionManagerImplInfo()
        {
        }

        private ComDayCqWcmCoreImplVersionManagerImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplVersionManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplVersionManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionManagerImplInfoBuilder</returns>
        public static ComDayCqWcmCoreImplVersionManagerImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplVersionManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplVersionManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionManagerImplInfoBuilder</returns>
        public ComDayCqWcmCoreImplVersionManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplVersionManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplVersionManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplVersionManagerImplInfo left, ComDayCqWcmCoreImplVersionManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplVersionManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplVersionManagerImplInfo left, ComDayCqWcmCoreImplVersionManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplVersionManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplVersionManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplVersionManagerImplProperties _Properties;

            internal ComDayCqWcmCoreImplVersionManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplVersionManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplVersionManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplVersionManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplVersionManagerImplInfoBuilder Properties(ComDayCqWcmCoreImplVersionManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplVersionManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplVersionManagerImplInfo</returns>
            public ComDayCqWcmCoreImplVersionManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplVersionManagerImplInfo(
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