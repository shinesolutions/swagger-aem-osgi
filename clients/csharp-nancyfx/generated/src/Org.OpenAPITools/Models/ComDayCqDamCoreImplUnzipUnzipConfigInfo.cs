using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplUnzipUnzipConfigInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplUnzipUnzipConfigInfo:  IEquatable<ComDayCqDamCoreImplUnzipUnzipConfigInfo>
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
        public ComDayCqDamCoreImplUnzipUnzipConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplUnzipUnzipConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplUnzipUnzipConfigInfo()
        {
        }

        private ComDayCqDamCoreImplUnzipUnzipConfigInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplUnzipUnzipConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplUnzipUnzipConfigInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder</returns>
        public static ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder</returns>
        public ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplUnzipUnzipConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplUnzipUnzipConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUnzipUnzipConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUnzipUnzipConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplUnzipUnzipConfigInfo left, ComDayCqDamCoreImplUnzipUnzipConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplUnzipUnzipConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUnzipUnzipConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUnzipUnzipConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplUnzipUnzipConfigInfo left, ComDayCqDamCoreImplUnzipUnzipConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplUnzipUnzipConfigInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplUnzipUnzipConfigProperties _Properties;

            internal ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUnzipUnzipConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUnzipUnzipConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUnzipUnzipConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUnzipUnzipConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplUnzipUnzipConfigInfoBuilder Properties(ComDayCqDamCoreImplUnzipUnzipConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplUnzipUnzipConfigInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplUnzipUnzipConfigInfo</returns>
            public ComDayCqDamCoreImplUnzipUnzipConfigInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplUnzipUnzipConfigInfo(
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