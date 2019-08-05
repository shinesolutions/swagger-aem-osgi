using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterDesignPackageImporterInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterDesignPackageImporterInfo:  IEquatable<ComDayCqWcmDesignimporterDesignPackageImporterInfo>
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
        public ComDayCqWcmDesignimporterDesignPackageImporterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterDesignPackageImporterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterDesignPackageImporterInfo()
        {
        }

        private ComDayCqWcmDesignimporterDesignPackageImporterInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterDesignPackageImporterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterDesignPackageImporterInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder</returns>
        public ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterDesignPackageImporterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterDesignPackageImporterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterDesignPackageImporterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterDesignPackageImporterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterDesignPackageImporterInfo left, ComDayCqWcmDesignimporterDesignPackageImporterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterDesignPackageImporterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterDesignPackageImporterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterDesignPackageImporterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterDesignPackageImporterInfo left, ComDayCqWcmDesignimporterDesignPackageImporterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterDesignPackageImporterInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterDesignPackageImporterProperties _Properties;

            internal ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterDesignPackageImporterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterDesignPackageImporterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterDesignPackageImporterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterDesignPackageImporterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterDesignPackageImporterInfoBuilder Properties(ComDayCqWcmDesignimporterDesignPackageImporterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterDesignPackageImporterInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterDesignPackageImporterInfo</returns>
            public ComDayCqWcmDesignimporterDesignPackageImporterInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterDesignPackageImporterInfo(
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