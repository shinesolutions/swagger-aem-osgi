using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo
    /// </summary>
    public sealed class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo:  IEquatable<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo>
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
        public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo()
        {
        }

        private OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo(string Pid, string Title, string Description, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.
        /// </summary>
        /// <returns>OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder</returns>
        public static OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder Builder()
        {
            return new OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder</returns>
        public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder With()
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

        public bool Equals(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo</param>
        /// <param name="right">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo left, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo</param>
        /// <param name="right">Compared (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo left, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.
        /// </summary>
        public sealed class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties _Properties;

            internal OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoBuilder Properties(OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo.
            /// </summary>
            /// <returns>OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo</returns>
            public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo Build()
            {
                Validate();
                return new OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo(
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